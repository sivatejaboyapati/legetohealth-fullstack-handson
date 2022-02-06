import { Component} from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class testComponent  {
  name: string = "Alex";
  sal: number= 340000;
  dob : Date = new Date(1995,9,25);
  fruits : any = ["apple", "mango","orange"];
  status : boolean = false;
  
  
}
