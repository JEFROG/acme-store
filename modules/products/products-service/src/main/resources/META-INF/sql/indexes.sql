create index IX_A4655C85 on ACME_ProductEntity (category);
create index IX_56D91D52 on ACME_ProductEntity (name[$COLUMN_LENGTH:75$]);
create index IX_672A8B07 on ACME_ProductEntity (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C6182749 on ACME_ProductEntity (uuid_[$COLUMN_LENGTH:75$], groupId);