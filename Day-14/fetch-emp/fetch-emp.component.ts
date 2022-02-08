import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-fetch-emp',
  templateUrl: './fetch-emp.component.html',
  styleUrls: ['./fetch-emp.component.css']
})
export class FetchEmpComponent implements OnInit {

  constructor(private _service: EmpService, private _builder: FormBuilder) { }

  ngOnInit(): void {
  }
  empe = this._builder.group({
    id: [], name : [], salary : []
  })
  emp: any = undefined;
  errorMessage: any = undefined;
  handleClick(): void {
    let id = this.empe.controls['id'].value;
    this._service.fetchEmpById(id).subscribe(response => {
      this.emp = response;
      this.errorMessage = undefined;
    }, err => {
      this.errorMessage = err.error.error;
      this.emp = undefined;
    })
    this.empe.reset({});
  }
}
