# Hello Internet
Few Examples of getting Spring Boot 2 (Spring 5) to run an OAuth2 Server.

## Projects:
### OAuth2_Server_For_DevPrototyping_APIs
Code template is taken from Chapter 7 from the excellent book Spring Microservices in Action. Written by John Carnell, Published by Manning. John Carnell's original code for the book is also on GitHub https://github.com/carnellj/spmia-chapter7/tree/master/authentication-service. Code has minor tweaks, and improvements and its stripped down to the essential code to setup the server.
   
### OAuth2_Server_w_Config_In_Db
Is a step forwards from the previous project. All the hardcoding from the source code has been removed and pushed into the database, and get one step closer to production level quality. Only bare minumum tables are present. Also added liquidbase to do bdatabase setup. Using h2 as db.
