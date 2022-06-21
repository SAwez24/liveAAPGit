import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { of } from 'rxjs';
import { SearchPipe } from 'src/app/pipe/search.pipe';
import { Contact } from 'src/app/models/Contact';
import { RouterTestingModule } from '@angular/router/testing';
import { ContactComponent } from 'src/app/contact/contact.component';
import { UserService } from 'src/app/services/user.service';

const contacts: Contact[] = [
  {
      name: 'Ravi',
      mobile: 1234567890
  },
  {
    name: 'abc',
    mobile: 9876543210
  },
  {
    name: 'xyz',
    mobile: 7834210723
  }
];

describe('ContactComponent', () => {
  let component: ContactComponent;
  let fixture: ComponentFixture<ContactComponent>;
  let userService: UserService;
  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      imports: [
        HttpClientModule, FormsModule, ReactiveFormsModule, RouterTestingModule
      ],
      declarations: [ ContactComponent, SearchPipe ],
      providers: [UserService]
    })
    .compileComponents();
    userService = TestBed.inject(UserService);
    spyOn(userService, 'getAllContacts').and.returnValue(of(contacts));
    spyOn(userService, 'addContact').and.returnValue(of(contacts));
  }));

  beforeEach(() => {

    fixture = TestBed.createComponent(ContactComponent);
    component = fixture.componentInstance;

    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  // test to check onSubmit method existence
  it('onSubmit() should exists', () => {
    expect(component.onSubmit).toBeTruthy();
  });

  // test to check ngOnInit method existence
  it('ngOnInit() should exists', () => {
    expect(component.ngOnInit).toBeTruthy();
  });

  // test to check addContact is called in onSubmit or not
  it('postNewContact() should call UserService to add a Contact ', () => {
    component.contacts = contacts;
    component.contactFormGroup.value.name = 'test';
    component.contactFormGroup.value.mobile = '123456';

    component.postNewContact();
    expect(userService.addContact).toHaveBeenCalled();
    expect(component.message).toEqual('Contact added');
  });
});
