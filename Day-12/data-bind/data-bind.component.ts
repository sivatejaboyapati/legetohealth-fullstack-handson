import { Component} from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent  {
   user : String ="Alice";
    toggleButton: boolean = true;
    message : string= 'shravani';
   handleClick(v : String) : void{
   this.user = v;
    this.toggleButton = !this.toggleButton;
  }
  

}
