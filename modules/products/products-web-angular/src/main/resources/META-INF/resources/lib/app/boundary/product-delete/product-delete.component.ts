import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Router } from "@angular/router";
import { FormControl, FormGroup, Validators } from "@angular/forms";

import { Product } from "../../entity/product";

@Component({
	selector: 'app-product-delete-ui',
	template: `
		<form [formGroup]="deleteForm" (ngSubmit)="onSubmit()">
			
			<div class="sheet sheet-lg">
				
				<!-- header -->
				<div class="sheet-header">
					<h1 class="sheet-title">{{Liferay.Language.get('delete-product')}}</h1>
					<h2 class="sheet-title">{{product.name}}</h2>
				</div>
				
				<div class="sheet-section">
					
					<!-- confirmation checkbox -->
					<div class="form-check">
						<input
							id="_delete"
							formControlName="confirmControl"
							class="form-check-input"
							type="checkbox"
							value=""
						/>
						<label class="form-check-label" for="_delete">
							{{Liferay.Language.get('click-checkbox-to-confirm-deletion')}}
						</label>
					</div>
					
				</div>
				
				<!-- delete & cancel button group -->
				<div class="sheet-footer sheet-footer-btn-block-sm-down">
					
					<div class="btn-group">
						
						<div class="btn-group-item">
							<button 
								[disabled]="deleteForm.invalid" 
								class="btn btn-secondary" 
								type="submit"
							>{{Liferay.Language.get('delete')}}</button>
						</div>
						
						<div class="btn-group-item">
							<button 
								class="btn btn-primary" 
								type="button" 
								(click)="onCancel()"
							>{{Liferay.Language.get('cancel')}}</button>
						</div>
						
					</div>
					
				</div>
				
			</div>
			
		</form>
	`,
	styles: []
})
export class ProductDeleteComponent {

	deleteForm = new FormGroup({

		confirmControl: new FormControl('', [Validators.requiredTrue])

	});

	@Input() product: Product;

	@Output() delete = new EventEmitter<number>();

	constructor(private router:Router) {
	}

	onSubmit(): void {

		if (this.deleteForm.valid) {

			this.delete.emit(this.product.id);

		}

	}

	onCancel(): void {

		this.router.navigate(['/productsPage']);

	}
}