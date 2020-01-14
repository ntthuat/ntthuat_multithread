CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

/* Create Tables */

CREATE TABLE exchange_rate
(
  id bigserial NOT NULL,
  from_currency varchar(20) NOT NULL,
  to_currency varchar(20) NOT NULL,
  rate decimal NOT NULL,
  source varchar(50) NOT NULL,
  classify varchar(50),
  _date date NOT NULL,
  country varchar(50) NOT NULL,
  created_by varchar(50) NOT NULL,
  created_date timestamp NOT NULL,
  updated_by varchar(50) NOT NULL,
  updated_date timestamp NOT NULL,

  PRIMARY KEY (id)
)
;