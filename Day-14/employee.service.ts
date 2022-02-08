import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  baseUrl = 'http://localhost:8080'
  constructor(private _client: HttpClient) { }
  fetchEmployees(): Observable<any> {
    let url = `${this.baseUrl}/employee`;
    return this._client.get(url);
  }
  store(employeeData: any): Observable<any> {

    let url = ``; 
    return this._client.post(url, employeeData);
  }
  fetchEmployeeById(id: number): Observable<any> {
    let url = `${this.baseUrl}/employee/${id}`
    return this._client.get(url);
  }
  updateSalary(empId: number, salary: number): Observable<any> {
    let url = `${this.baseUrl}/em` 
    return this._client.put(url, undefined); 
  }
}
