-- USERS --
create table if not exists public.users
(
    id               bigserial
        constraint users_pk
            primary key,
    firstname        varchar(20),
    secondname       varchar(20),
    age              integer,
    telephone_number varchar(20),
    email            varchar(20),
    created          timestamp default now() not null,
    updated          timestamp default now() not null,
    sex              varchar(1),
    is_deleted       boolean   default false
);

alter table public.users
    owner to postgres;

-- SECURITY --
create table if not exists public.security
(
    id       integer                                       not null
        constraint security_pk
            primary key,
    login    varchar(20)                                   not null,
    password varchar(20)                                   not null,
    role     varchar(20) default 'USER'::character varying not null,
    created  timestamp   default now()                     not null,
    updated  timestamp   default now()                     not null,
    user_id  bigint                                        not null
        unique
        constraint security_users_id_fk
            references public.users
            on update cascade on delete cascade
);

alter table public.security
    owner to postgres;

-- PRODUCT --
create table if not exists public.product
(
    id      bigserial
        constraint product_pk
            primary key,
    name    varchar(20)             not null,
    price   double precision        not null,
    created timestamp default now() not null,
    updated timestamp default now() not null
);

alter table public.product
    owner to postgres;

-- I_USERS_PRODUCT --
create table if not exists public.i_users_product
(
    id         integer not null
        constraint i_users_product_pk
            primary key,
    user_id    bigint  not null
        constraint i_users_product_users_id_fk
            references public.users
            on update cascade on delete cascade,
    product_id bigint  not null
        constraint i_users_product_product_id_fk
            references public.product
            on update cascade on delete cascade,
    created    timestamp default now(),
    updated    timestamp default now()
);

alter table public.i_users_product
    owner to postgres;

