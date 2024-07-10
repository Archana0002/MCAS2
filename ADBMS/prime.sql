declare
  a number:=&a;
  result varchar2(20);
begin
  result:=is_prime(a);
  dbms_output.put_line('the number is'||a||'is'||result);
end;
/
  