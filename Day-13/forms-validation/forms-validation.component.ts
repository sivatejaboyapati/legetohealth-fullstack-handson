import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-forms-validation',
  templateUrl: './forms-validation.component.html',
  styleUrls: ['./forms-validation.component.css']
})
export class formsValidationComponent {
  constructor(private _router: Router, private _builder: FormBuilder) { }
  profile = this._builder.group({
    firstName: ['', Validators.compose([Validators.required, Validators.minLength(3)])],
    lastName: ['', Validators.compose([Validators.required, Validators.minLength(3)])]
  });
  handleSubmit(): void {
    let firstname = this.profile.controls['firstName'].value
    if (firstname == 'Alex') {
      sessionStorage.setItem('user', firstname)
      this._router.navigate(['success', firstname])
    }
    else {
      this._router.navigate(['forms'])
      this.profile.reset({});
    }
  
  }
}
