CREATE DATABASE cashflow;

-- Table: public.categoria

-- DROP TABLE public.categoria;

CREATE TABLE public.categoria
(
    id integer NOT NULL DEFAULT nextval('categoria_id_seq'::regclass),
    clasificacion character varying(40) COLLATE pg_catalog."default",
    categoria character varying(20) COLLATE pg_catalog."default",
    sub_categoria character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT categoria_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.categoria
    OWNER to postgres;


-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    nombres character varying(40) COLLATE pg_catalog."default",
    apellidos character varying(20) COLLATE pg_catalog."default",
    rol character varying(20) COLLATE pg_catalog."default",
    fecha_de_nacimiento character varying(10) COLLATE pg_catalog."default",
    email character varying(30) COLLATE pg_catalog."default",
    password character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;