CREATE TABLE todo
(
  id   VARCHAR(32),
  text VARCHAR(32),
  complete boolean not null
);

INSERT INTO todo(id, text, complete) VALUES ('1', 'todo1', false);
INSERT INTO todo(id, text, complete) VALUES ('2', 'todo2', true);
commit;