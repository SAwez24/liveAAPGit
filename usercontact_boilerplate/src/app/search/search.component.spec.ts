import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { Contact } from 'src/app/models/Contact';
import { SearchComponent } from 'src/app/search/search.component';
import { UserService } from 'src/app/services/user.service';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';
import { SearchPipe } from 'src/app/pipe/search.pipe';
import { of } from 'rxjs';


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

describe('SearchComponent', () => {
  let component: SearchComponent;
  let fixture: ComponentFixture<SearchComponent>;
  let userService: UserService;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      imports: [
        HttpClientModule, FormsModule, ReactiveFormsModule, RouterTestingModule
      ],
      declarations: [ SearchComponent, SearchPipe ],
      providers: [UserService]
    })
    .compileComponents();
    userService = TestBed.inject(UserService);
    spyOn(userService, 'getAllContacts').and.returnValue(of(contacts));
    spyOn(userService, 'addContact').and.returnValue(of(contacts));
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  // test to check getAllContacts is called in ngOnInit or not
  it('ngOnInit() should call UserService to getAllContacts ', () => {
    component.ngOnInit();
    expect(userService.getAllContacts).toHaveBeenCalled();
  });
});
