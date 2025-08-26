alter table profiles
    modify bio text null;

alter table profiles
    modify phone_number varchar(15) null;

alter table profiles
    modify loyalty_points int unsigned default 0 null;

alter table profiles
    add constraint profiles_pk
        primary key (id);

alter table profiles
    add constraint profiles_users_id_fk
        foreign key (id) references users (id);


alter table tags
    modify id int;

alter table tags
    auto_increment = 1;

alter table tags
    modify name varchar(255) not null;

alter table tags
    add constraint tags_pk
        primary key (id);

alter table tags
    modify id int auto_increment;

create table user_tags
(
    user_id bigint not null,
    tag_id  int    not null,
    constraint user_tags_pk
        primary key (tag_id, user_id),
    constraint user_tags_tags_id_fk
        foreign key (tag_id) references tags (id) on delete cascade ,
    constraint user_tags_users_id_fk
        foreign key (user_id) references users (id) on delete cascade
);


