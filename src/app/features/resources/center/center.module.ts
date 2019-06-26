import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CreateComponent } from './create/create.component';
import { ViewComponent } from './view/view.component';
import { CenterRoutingModule } from './center-routing.module';
import { SharedModule } from '../../../shared/shared.module';
import { MaterialModule } from 'src/app/shared/material.module';
import { CenterHeaderComponent } from './center-header/center-header.component';
import { I18nModule } from '../../../../app/i18n.module';

@NgModule({
  imports: [
    CommonModule,
    CenterRoutingModule,
    SharedModule,
    MaterialModule,
    I18nModule
  ],
  declarations: [CreateComponent, ViewComponent, CenterHeaderComponent]
})
export class CenterModule { }
