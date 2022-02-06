import { ComponentFixture, TestBed } from '@angular/core/testing';

import { testComponent } from './test.component';

describe('testComponent', () => {
  let component: testComponent;
  let fixture: ComponentFixture<testComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ testComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(testComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
