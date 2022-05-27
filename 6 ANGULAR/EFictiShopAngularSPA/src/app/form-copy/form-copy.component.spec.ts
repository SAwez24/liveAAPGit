import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormCopyComponent } from './form-copy.component';

describe('FormCopyComponent', () => {
  let component: FormCopyComponent;
  let fixture: ComponentFixture<FormCopyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormCopyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormCopyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
