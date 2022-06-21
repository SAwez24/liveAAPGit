import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { environment } from 'src/environments/environment';
import { catchError, retry, } from 'rxjs/operators';
import { Contact } from '../models/Contact';
const URL = 'http://localhost:3000/contacts';
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
};

@Injectable({
  providedIn: 'root'
})
export class UserService {
  constructor(private http: HttpClient) {}

  // Implement addContacts method using HttpClient for saving a Contacts details by making POST request
  addContact(contact: Contact): Observable<any> {
    return this.http
    .post<Contact>(URL, contact, httpOptions)
    .pipe(retry(1), catchError(this.handleError));
  }

  // Implement getAllContactss method using HttpClient for getting all Contacts details GET request
  getAllContacts(): Observable<any> {
    return this.http
    .get<Contact[]>(URL)
    .pipe(retry(1), catchError(this.handleError));
  }
  private handleError(error: HttpErrorResponse) {
  if (error.status === 0) {
    // A client-side or network error occurred. Handle it accordingly.
    console.error('An error occurred:', error.error);
  } else {
    // The backend returned an unsuccessful response code.
    // The response body may contain clues as to what went wrong.
    console.error(
      `Backend returned code ${error.status}, body was: `,
      error.error
    );
  }
  // Return an observable with a user-facing error message.
  return throwError(
    () => new Error('Something bad happened; please try again later.')
  );
}
}
