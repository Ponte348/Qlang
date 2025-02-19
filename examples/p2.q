name: text;
id: integer;
name := read "Nome: ";
id := integer(read "ID: ");
result.name := name;
result.id := id;

println "Nome: " name ", id: " text(id); # text concatenation!
# conversion between type similar to PIL

# define code (inline) (no execution involved); not a question!
code PIL.Example1 is # default is code of PIL type (the only one to be implemented)
"[
   -- PIL code from here
   n := integer(read "Number: "); -- type conversion: type(expression)
   write "Number ",n, " is ";
   if n % 2 = 0 then -- = is the comparison operator (as in math)
      writeln "even"
   else
      writeln "odd"
   end;
   -- PIL code to here
]"
end;

c: code; # code type variable
c := new PIL.Example1;
res: text;
res := execute c; # standard output stored in res
res := "10" | execute c; # uses "10" as standard input
execute c; # output goes to standard output

# code execution outside a question has no impact on questionnaire grading

code-hole Algorithm.Code1 is
   println "Complete o seguinte código.";
   uses code PIL.Example1
      10,"n % 2 = 0"; # grade 10, first match for text
      5,"else" line 2 # grade 5, first match starting at line 2 for text
      # syntax (comma separated): [grade] [match-count] text
   end;
end; # total points defined in question: 10+5=15, final grade: sum-correct-points / total-points

execute new Algorithm.Code1;

export result to "result-p2.txt";

