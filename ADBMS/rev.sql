create or replace function reverse_it(x in number)
return number is 
z number:=0;
n number;
r number;
begin
  n:=x;
  while(n>0)
  loop
   r:=MOD(n,10);
   z:=z*10+r;
   n:=floor(n/10);
  end loop;
  return z;
end;
/
