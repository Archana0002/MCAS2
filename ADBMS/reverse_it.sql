declare
  a number:=&a;
  c number;
begin
  c:=reverse_it(a);
  dbms_output.put_line('the reverse of a number is:'||c);
end;
/
