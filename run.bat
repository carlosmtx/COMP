call jjtree projeto.jjt
call javacc projeto.jj
call javac  *.java
call java  Invariant
del *.java
del *.jj
del *.class
call pause
call cls