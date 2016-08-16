CREATE TABLE medicamentos(ID    INTEGER PRIMARY KEY  NOT NULL, NOMBRE            TEXT    NOT NULL, DOSIS             TEXT    NOT NULL, CANTIDAD          TEXT    NOT NULL, MAXIMO            TEXT    NOT NULL, MINIMO            TEXT    NOT NULL, COMENTARIO        TEXT    NOT NULL);
CREATE TABLE salidas(ID    INTEGER PRIMARY KEY NOT NULL, FECHA             TEXT    NOT NULL, NOMBRE            TEXT    NOT NULL, CANTIDAD          TEXT    NOT NULL, COMENTARIO        TEXT    NOT NULL);
CREATE TABLE entradas(ID    INTEGER PRIMARY KEY NOT NULL, FECHA             TEXT    NOT NULL, NOMBRE            TEXT    NOT NULL, CANTIDAD          TEXT    NOT NULL, CADUCIDAD         DATE    NOT NULL);
