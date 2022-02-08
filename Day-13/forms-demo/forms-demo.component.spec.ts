import { ComponentFixture, TestBed } from '@angular/core/testing';

import { formsDemoComponent } from './forms-demo.component';

describe('MdfDemoComponent', () => {
  let component: formsDemoComponent;
  let fixture: ComponentFixture<formsDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ formsDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(formsDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
