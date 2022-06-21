import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { Contact } from '../models/Contact';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
  // Declare required variables
  contactFormGroup!:FormGroup
  message:string=""
  contacts: Contact[] = [];

  // Method to execute on submitting form
  onSubmit(onSubmit: any) {
    this.postNewContact();
  }

  constructor(private cont: FormBuilder, private user: UserService, private router: Router) { }

  // Create a new form group onInit
  ngOnInit(): void {
    this.contactFormGroup=this.cont.group({
      name:['',[Validators.required]],
      mobile:['',[Validators.required]]
    });
  }


  // Post new contact to json server by making POST request
  postNewContact() {
    this.user.addContact(new Contact(this.contactFormGroup.value.name,this.contactFormGroup.value.mobile)).subscribe((q)=>console.log(q));
    this.message="Contact added";
    // post Api
  }

}

