CREATE DATABASE scs
  WITH ENCODING='UTF8'
       OWNER=postgres
       CONNECTION LIMIT=-1
       TABLESPACE=pg_default;

CREATE SCHEMA scs
       AUTHORIZATION postgres;


CREATE TABLE scs.contactos(
	n_id bigint NOT NULL,
	n_cedula TEXT,
	n_rif TEXT,
	s_usuariosis TEXT,
	s_pnombre TEXT,
	s_snombre TEXT,
	s_papellido TEXT,
	s_sapellido TEXT,
	n_edad int4,
	s_correo TEXT,
	n_telefmo TEXT,
	n_telefof TEXT,
	s_tipodocumento TEXT,
	dt_fechanaci timestamp,
	s_sexo TEXT,
	s_medicotra TEXT,
	s_cargo TEXT,
	s_profesi TEXT,
	s_nacionali TEXT,
	s_estadocivil TEXT,
	s_jefedirec TEXT,
	s_usujefedirec TEXT,
	n_cedulajefe TEXT,
	s_twitter TEXT,
	s_instagram TEXT,
	s_comentario TEXT,
	n_id_empresa bigint,
	n_id_direccion bigint,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT contactos_pk PRIMARY KEY (n_id)
);
                               
CREATE TABLE scs.operadores(
	n_id bigint NOT NULL, 
	s_usuariosis TEXT,
	s_pnombre TEXT,
	s_snombre TEXT,
	s_papellido TEXT,
	s_sapellido TEXT,
	s_correo TEXT,
	n_telefof TEXT,
	s_contras TEXT,
	dt_ultimahora timestamp,
	n_id_empresa bigint,
	n_id_contacto bigint,
	b_activo boolean,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT operador_pk PRIMARY KEY (n_id)
);

CREATE TABLE scs.roles(
	n_id bigint NOT NULL,
	s_nombre TEXT,
	s_descri TEXT,
	s_estadop TEXT,
	b_actualizar boolean,
	b_modificar boolean,
	b_eliminar boolean,
	b_ver boolean,
	b_esadmin boolean,
	s_usuariosis_operador TEXT,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT rol_pk PRIMARY KEY (n_id)	
);

CREATE TABLE scs.direcciones(
	n_id bigint NOT NULL, 
	s_pais TEXT,
	s_estado TEXT,
	s_municipio TEXT,
	s_despart TEXT,
	s_provin TEXT,
	s_parroq TEXT,
	s_sector TEXT,
	s_caavca TEXT,
	s_casaedi TEXT,
	s_piso TEXT,
	n_numcasa int4,
	s_prefer TEXT,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT direcciones_pk PRIMARY KEY (n_id)
);

CREATE TABLE scs.empresas(
	n_id bigint NOT NULL, 
	s_nombre TEXT,
	n_telefof TEXT,
	n_fax TEXT,
	s_correo TEXT,
	s_pweb TEXT,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT empresas_pk PRIMARY KEY (n_id)
);

CREATE TABLE scs.presupuestos(
	n_id_presupuesto bigint NOT NULL, 
	dt_fpresupuesto timestamp,
	s_fkpaciente_usuariosis TEXT,
	s_fkdoctor_usuariosis TEXT,
	n_subtotal double precision,
	n_impuesto double precision,
	n_total double precision,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT presupuestos_pk PRIMARY KEY (n_id_presupuesto)
);

CREATE TABLE scs.articulos(
	n_id_articulo bigint NOT NULL, 
	n_id_presupuesto bigint,
	n_numarticulo bigint,
	s_desarticulo TEXT,
	n_cantarticulo bigint,
	n_precio double precision,
	n_total double precision,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT articulos_pk PRIMARY KEY (n_id_articulo)
);

CREATE TABLE scs.historias(
	n_id bigint NOT NULL, 
	dt_fechaconsul timestamp,
	s_moticonsul TEXT,
	s_anteceenferme TEXT,
	s_antehedofamil TEXT,
	b_padresvivos boolean,
	b_padresfalle boolean,
	s_causaspapfalle TEXT,
	b_hermasvivos boolean,
	b_hemasfallec boolean,
	s_causasherfalle TEXT,
	b_hijosvivos boolean,
	b_hijosfalle boolean,
	s_causashijfalle TEXT,
	b_famidiabetes boolean,
	b_famihiperten boolean,
	b_famitubercul boolean,
	b_famigenelar boolean,
	s_otrasfamienfer TEXT,
	b_habialcohol boolean,
	b_habitabaco boolean,
	b_habidrogas boolean,
	b_patodiabet boolean,
	b_patohipert boolean,
	b_patotuberc boolean,
	s_otraspatoenfer TEXT,
	s_cirugiperso TEXT,
	s_traumasperso TEXT,
	s_alergiaperso TEXT,
	s_otrasenferperso TEXT,
	b_embarazo boolean,
	s_impregeneralfisi TEXT,
	s_sigvitalfc TEXT,
	s_sigvitalta TEXT,
	s_sigvitalrf TEXT,
	s_sigvitalpul TEXT,
	s_sigvitaltaux TEXT,
	s_sigvitaltrectal TEXT,
	n_pesohabi TEXT,
	n_pesoactual TEXT,
	n_talla TEXT,
	n_imc TEXT,
	s_diagnost TEXT,
	s_tratamie TEXT,
	s_comengenerales TEXT,
	n_id_contacto_paciente bigint,
	n_id_contacto_doctor bigint,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT historias_pk PRIMARY KEY (n_id)
);
							   
CREATE TABLE scs.informes(
	n_id bigint NOT NULL,
	dt_fechainforme timestamp,
	s_notivoconsulta TEXT,
	s_diagnost TEXT,
	s_esturealizado TEXT,
	s_tratamie TEXT,
	b_incapatemp boolean,
	dt_iniincatemp timestamp,
	dt_finincatemp timestamp,
	b_incapatotal boolean,
	n_id_contacto_paciente bigint,
	n_id_contacto_doctor bigint,
	dt_sysmodtime timestamp,
	s_sysmoduser TEXT,
	n_sysmodcount TEXT,
	CONSTRAINT informes_pk PRIMARY KEY (n_id)
);

CREATE TABLE scs.citas(
	n_id bigint NOT NULL,
	n_inciocita bigint NOT NULL,
	n_fincita bigint NOT NULL,
	s_tipocita text,
	s_titulo text,
	s_moticita text NOT NULL,
	s_usuariosis_contacto_paciente text,
	s_usuariosis_contacto_doctor text,
	dt_sysmodtime timestamp without time zone,
	s_sysmoduser text,  
	n_sysmodcount text,
	s_url text,
	CONSTRAINT cita_pk PRIMARY KEY (n_id)	
);

ALTER TABLE scs.contactos
    ADD CONSTRAINT contactos_empresas_fk FOREIGN KEY (n_id_empresa)
                               REFERENCES scs.empresas 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.contactos
    ADD CONSTRAINT contactos_direcciones_fk FOREIGN KEY (n_id_direccion)
                               REFERENCES scs.direcciones 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.contactos
ADD CONSTRAINT contacto_usuariosistema_unico UNIQUE (s_usuariosis) USING INDEX TABLESPACE pg_default;


ALTER TABLE scs.operadores
    ADD CONSTRAINT operadores_empresas_fk FOREIGN KEY (n_id_empresa)
                               REFERENCES scs.empresas 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.operadores
    ADD CONSTRAINT operadores_contactos_fk FOREIGN KEY (n_id_contacto)
                               REFERENCES scs.contactos 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.operadores
	ADD CONSTRAINT usuariosistema_contacto_fk FOREIGN KEY (s_usuariosis)
                               REFERENCES scs.contactos (s_usuariosis) 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.operadores
ADD CONSTRAINT operadores_contactos_unico UNIQUE (n_id_contacto) USING INDEX TABLESPACE pg_default;
ALTER TABLE scs.operadores
ADD CONSTRAINT usuariosistema_unico UNIQUE (s_usuariosis) USING INDEX TABLESPACE pg_default;

                               
ALTER TABLE scs.presupuestos
    ADD CONSTRAINT presupuestos_contactos_paci_fk FOREIGN KEY (s_fkpaciente_usuariosis)
                               REFERENCES scs.contactos (s_usuariosis) 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.presupuestos
    ADD CONSTRAINT presupuestos_contactos_doct_fk FOREIGN KEY (s_fkdoctor_usuariosis)
                               REFERENCES scs.contactos (s_usuariosis) 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.articulos
    ADD CONSTRAINT articulos_presupuestos_fk FOREIGN KEY (n_id_presupuesto)
                               REFERENCES scs.presupuestos (n_id) 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;

ALTER TABLE scs.historias
    ADD CONSTRAINT historias_contactos_paci_fk FOREIGN KEY (n_id_contacto_paciente)
                               REFERENCES scs.contactos 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.historias
    ADD CONSTRAINT historias_contactos_doct_fk FOREIGN KEY (n_id_contacto_doctor)
                               REFERENCES scs.contactos 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.historias
ADD CONSTRAINT historias_contactos_paci_unico UNIQUE (n_id_contacto_paciente) USING INDEX TABLESPACE pg_default;
ALTER TABLE scs.historias
ADD CONSTRAINT historias_contactos_doct_unico UNIQUE (n_id_contacto_doctor) USING INDEX TABLESPACE pg_default;

ALTER TABLE scs.informes
    ADD CONSTRAINT informes_contactos_paci_fk FOREIGN KEY (n_id_contacto_paciente)
                               REFERENCES scs.contactos 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.informes
    ADD CONSTRAINT informes_contactos_doct_fk FOREIGN KEY (n_id_contacto_doctor)
                               REFERENCES scs.contactos 
                               ON UPDATE RESTRICT ON DELETE RESTRICT;
ALTER TABLE scs.informes
ADD CONSTRAINT informes_contactos_paci_unico UNIQUE (n_id_contacto_paciente) USING INDEX TABLESPACE pg_default;
ALTER TABLE scs.informes
ADD CONSTRAINT informes_contactos_doct_unico UNIQUE (n_id_contacto_doctor) USING INDEX TABLESPACE pg_default;

ALTER TABLE scs.roles
  ADD CONSTRAINT roles_operadores_fk FOREIGN KEY (s_usuariosis_operador) 
				REFERENCES scs.operadores (s_usuariosis) 
				ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE scs.citas
  ADD CONSTRAINT citas_contactos_paciente_fk FOREIGN KEY (s_usuariosis_contacto_paciente) 
				REFERENCES scs.contactos (s_usuariosis) 
				ON UPDATE NO ACTION ON DELETE NO ACTION;	
ALTER TABLE scs.citas
  ADD CONSTRAINT citas_contactos_doctor_fk FOREIGN KEY (s_usuariosis_contacto_doctor) 
				REFERENCES scs.contactos (s_usuariosis) 
				ON UPDATE NO ACTION ON DELETE NO ACTION;