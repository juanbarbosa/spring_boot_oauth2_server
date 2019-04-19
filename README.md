# Hello Internet
Few Demos of getting Spring Boot 2 (Spring 5) to run an OAuth2 Server.
At the time of this writting, there's only one though... (more soon-ish, working on the next one at the moment)

Projects:
   1. OAuth2_Server_For_DevPrototyping_APIs: This project is straight up out of the book, it uses a in-memory database.
   This code has a minor tweak from the original in the OAuth2Config.java where we needed to add {noop} to the .secret code on line 23. Main Reason is because (I think, as I'm still learning spring here) that the NoPasswordEncoder class is deprecated in Spring 5 and therefore, you need to specify the {noop} string to enforce the NoPasswordEncoder functionality, or at runtime you'll get a NoPasswordEncoder issue. Also, this version removes a lot of unnecessary stuff that is in the original repo.
   
   Full Disclaimer:
Code template is taken from Chapter 7 from the excellent book Spring Microservices in Action. Written by John Carnell, Published by Manning. John Carnell's original code for the book is also on GitHub https://github.com/carnellj/spmia-chapter7/tree/master/authentication-service.

   Reason why this code is here is because:
   1) I'm teaching myself spring, I found that the code did not work on my STS 4 (Spring Tool Suite 4), because it needed a bit of tweaking. So, I'm trying to help other newbies such as me, so they avoid the struggle.
   2) Also, John's repo for this example has a lot on uncessary code that, I consider, would distract from the code that really matters to illustrate this example.
   
   2. OAuth2_Server_w_Config_In_Db: [Not Committed yet] Is an upgrade is a step forwards from 1. where all the hardcoding from the source code has been removed and pushed into the database. 
