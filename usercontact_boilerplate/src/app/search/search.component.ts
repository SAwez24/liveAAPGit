import { Component, OnInit } from '@angular/core';
import { Contact } from '../models/Contact';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchText = '';
  contacts: Contact[] = [];
  constructor(private userservice: UserService) { }

  // Get all conatcts by making GET request to json server
  ngOnInit(): void {
    this.userservice.getAllContacts().subscribe((contacts) => {
      this.contacts= contacts;
      console.log(contacts);
    });
  }

}
