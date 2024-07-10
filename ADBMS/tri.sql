create trigger t6 before insert or update on xy
begin
if inserting then
    insert into testt values('insert done',SYSDATE);
else
   insert into testt values('update done',SYSDATE);
end if;
end;
/
