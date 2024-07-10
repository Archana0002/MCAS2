create or replace function is_prime(x in number)
return varchar2 is
i number;
flag boolean:=true;
begin
  if x<=1 then
   return 'not prime';
  elsif x=2 then
   return 'prime';
  else 
   for i in 2..floor(sqrt(x))
   loop
    if mod(x,i)=0 then
      flag:=false;
      exit;
    end if;
   end loop;
  end if;

if flag then
   return 'prime';
else
   return 'not prime';
end if;
end;
/
 


