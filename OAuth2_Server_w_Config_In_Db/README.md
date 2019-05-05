# Hello Internet
In this second example we moved away from that in memory databases into a more "concrete" database so we can see what is changing datawise as we login.

We are using a very stripped down version of an oauth2 server so we can just focus on the essentials, 
if your an oauth2 expert or something (please feel free to give me some pointers, I'm learning here :p)

Also, we are using liquidbase in this demo to setup the data and schema. 
Liquidbase forces me to write tables in an interface that any db implementation, so I love it.

## Things to look at in this iteration
1. OAuth2ResourceConfig has config to enable access to h2 so you can see the data real time

2. Speaking of h2, once the server is running, you can access it through http://localhost:8080/auth/h2-console/

3. Liquidbase will setup your schema, but I've commented out some of the tables that Spring OAuth uses, 
because (at the time of this writting) I have no clue what they are for (I'm learning oauth here...). You can uncomment them out
in order to setup your schema, if you so wish.

4. Process to authenticate is the same as before, I wont add those screenshots, look at the previous example in this repo
"OAuth2_Server_For_DevPrototyping_APIs" for the screenshots on how to login. In this one all we have is a screenshot of the
data in the h2 database once we got an authentication going

5. WebSecurityConfigurer and OAuth2Config use a datastore now to persist their data.


## References
I wish I could say that I can code this from scratch, but I can't. I need a bunch of help since I'm learning spring, oauth, and whole bunch of other stuff.
In order to give credit where credit is due:
1. John Carnell for writting Spring Microservices in Action

2. Eugen Paraschiv at baeldung.com for some examples at what I wanted to do for this version.
https://www.baeldung.com/rest-api-spring-oauth2-angular
https://www.baeldung.com/spring-security-oauth-dynamic-client-registration

3. Pivotal for writting Spring.io (I love you guys)

4. John Thompson at the springframework.guru website for helping me figure out how to access h2 console
https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/