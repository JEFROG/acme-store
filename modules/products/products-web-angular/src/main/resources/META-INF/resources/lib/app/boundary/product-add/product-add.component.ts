import { Component, EventEmitter, Output } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { FormControl, FormGroup, Validators } from "@angular/forms"

import { Product } from "../../entity/product";
import { config } from "../../config";

@Component({
	selector: 'app-product-add-ui',
	template: `
		<form [formGroup]="addForm" (ngSubmit)="onSubmit()">
			
			<div class="sheet sheet-lg">
				
				<div class="sheet-header">
					<h2 class="sheet-title">Add Product</h2>
				</div>
				
				<div class="sheet-section">
					
					<!-- Category Field -->
					<div class="form-group">
						
						<label for="_category">
							Category
							<span class="reference-mark text-warning">
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
								
							</span>
							
						</label>
						
						<select 
							id="_category" 
							formControlName="category" 
							class="form-control"
						>
							<option value="" disabled selected>Select a category</option>
							<option>Electronics</option>
							<option>Sporting Goods</option>
						</select>
					</div>
					
					<!-- name field -->
					<div class="form-group">
						
						<label for="_name">
							Name
							<span class="reference-mark text-warning">
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
							</span>
						</label>
						
						<input
							id="_name"
							formControlName="name"
							class="form-control"
							placeholder="Enter Name"
							type="text"
						/>
					</div>
					
					<!-- price field -->
					<div class="form-group">
						
						<label for="_price">
							Price
							<span class="reference-mark text-warning">
								<svg 
									aria-hidden="true" 
									class="lexicon-icon lexicon-icon-asterisk" 
									focusable="false"
								>
									<use [attr.href]="iconsURL + '#asterisk'"></use>
								</svg>
							</span>
						</label>
						
						<input
							id="_price"
							formControlName="price"
							class="form-control"
							placeholder="Enter Price"
							type="text"
						/>
					</div>
					
					<!-- stocked field -->
					<div class="form-check">
						<input
							id="_stocked"
							formControlName="stocked"
							class="form-check-input"
							type="checkbox"
							value=""
						/>
						
						<label 
							class="form-check-label" 
							for="_stocked">
							Product is in stock
						</label>
					</div>
					
				</div>
				
				<!-- add & cancel button group -->
				<div class="sheet-footer sheet-footer-btn-block-sm-down">
					
					<div class="btn-group">
						
						<div class="btn-group-item">
							<button 
								class="btn btn-primary" 
								type="submit" 
								[disabled]="addForm.invalid"
							>Add</button>
						</div>
						
						<div class="btn-group-item">
							<button 
								class="btn btn-secondary" 
								type="button" 
								(click)="onCancel()"
							>Cancel</button>
							
						</div>
						
					</div>
					
				</div>
				
			</div>

		</form>
	`,
	styles: []
})
export class ProductAddComponent {

	iconsURL = config.iconsURL;

	addForm = new FormGroup({
		name: new FormControl('', [Validators.required]),
		price: new FormControl('', [Validators.required]),
		category: new FormControl('', [Validators.required]),
		stocked: new FormControl(false),
	});

	@Output() add = new EventEmitter<Product>();

	constructor(private route: ActivatedRoute, private router:Router) {
	}

	onSubmit(): void {
		if (this.addForm.valid) {
			this.add.emit(this.addForm.value);
		}
	}

	onCancel(): void {
		this.router.navigate(['/productsPage']);
	}
}