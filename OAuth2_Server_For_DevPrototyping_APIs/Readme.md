# Hello Again Internet
Updated code to work with spring-boot-starter-parent version 2.1.4.RELEASE
Since I couldn't get it to work as presented in the book in my Spring Tool Suite 4 environment as is.

Example taken from Chapter 7 of the book Spring Microservices in Action by John Carnell. Published by Manning.
(https://github.com/carnellj/spmia-chapter7/tree/master/authentication-service)

If you have the book handy, please refer to pictures 7.2, 7.3, 7.4 and 7.5 to use.
In case you don't, please refer to the steps 1, 2 and 3 jpegs that I've added to get an idea on how to consume this example.

This code has a minor tweak from the original where we needed to add {noop} so passwords and secrets in the hardconding of the config. Main Reason is because (I think, as I'm still learning spring here, so I may be wrong) the NoPasswordEncoder class is deprecated and use has been stopped in Spring 5 and therefore, you need to specify the {noop} string to force no password encoding functionality, or at runtime you'll get a NoDefaultPasswordEncoder exception.
   
Reason why this code is here is because: 
  1) I'm teaching myself spring, and this is the example that I'm going off. I found that the code did not work on my STS 4 (Spring Tool Suite 4), because it needed a bit of tweaking. Probably because it was compiled for Spring 5/Spring Boot 2, where the original code is probably compiled for a previous version of spring and they didn't run into those shenanigans. So, I'm trying to help other newbies such as me to avoid the struggle. 
  2) Also, John's repo for this example has a lot on uncessary code that, I consider, would distract from the code that really matters to illustrate this example. So this is very bare bones and laser focus for those that wish to fork.

## Seriously though:
Go buy the book if you don't own a copy, John Carnell put a lot of work to make that book and the code examples. 
Don't be stingy and support the author, hard work should never go unrewarded.
