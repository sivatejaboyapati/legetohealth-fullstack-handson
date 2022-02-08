import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-forms-demo',
  templateUrl: './forms-demo.component.html',
  styleUrls: ['./forms-demo.component.css']
})
export class formsDemoComponent {
constructor(private _builder : FormBuilder){}
profile = this._builder.group({
  firstName : [''],
  lastName : ['']
});
handleSubmit() : void{
  console.log(this.profile.value)
}
}
