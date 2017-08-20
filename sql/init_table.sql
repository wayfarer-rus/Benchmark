CREATE TABLE public.chocolate
(
  id bigint NOT NULL,
  name character varying(255),
  type character varying(255),
  wieght integer,
  CONSTRAINT chocolate_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.chocolate
  OWNER TO postgres;


CREATE TABLE public.cookie
(
  id bigint NOT NULL,
  cereal character varying(255),
  type character varying(255),
  wieght integer,
  CONSTRAINT cookie_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.cookie
  OWNER TO postgres;