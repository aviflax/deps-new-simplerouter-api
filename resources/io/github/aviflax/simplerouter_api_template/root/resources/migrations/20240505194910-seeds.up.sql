insert into "user" ("name")
values ('Geordi La Forge'),
       ('Worf');

--;;

insert into "thing" ("name")
values ('visor'),
       ('bat''leth');

--;;

insert into "users_things" ("user_id", "thing_id", "quantity")
select "user".id, thing.id, 1
from "user", "thing"
where "user".name = 'Geordi La Forge'
  and thing.name = 'visor';

--;;

insert into "users_things" ("user_id", "thing_id", "quantity")
select "user".id, thing.id, 1
from "user", "thing"
where "user".name = 'Worf'
  and thing.name = 'bat''leth';
