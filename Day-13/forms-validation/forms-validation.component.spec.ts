import { ComponentFixture, TestBed } from '@angular/core/testing';

import { formsValidationComponent } from './forms-validation.component';

describe('formsValidationComponent', () => {
  let component: formsValidationComponent;
  let fixture: ComponentFixture<formsValidationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ formsValidationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(formsValidationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
