create table ACME_ProductEntity (
	uuid_ VARCHAR(75) null,
	productId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	category INTEGER,
	name VARCHAR(75) null,
	price DOUBLE,
	stocked BOOLEAN
);