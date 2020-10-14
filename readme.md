# Tyrannogotchi

The backend of a Tamagotchi-inspired application where the user can create an account and take care of a virtual T-Rex.

See the frontend code <a href="https://github.com/helenakolberg/tyrannogotchi_frontend">here</a>

## How To Run

In order to run this application, you need to create a free <a href="https://developer.okta.com/">Okta Developer</a> account.

## Once You Have an Okta Account, Follow These Steps:


* Login to Okta and click Applications:

<kbd><img src="https://i.ibb.co/zsR2602/1-applications.png" style="border:1px solid grey"/></kbd>

* Click Add Application:

<kbd><img src="https://i.ibb.co/3pMsww0/2-add.png" style="border:1px solid grey"/></kbd>

* Click Web and then Next:

<kbd><img src="https://i.ibb.co/nbW5HP3/3-webnext.png" style="border:1px solid grey"/></kbd>
            
* Give your application a Name and set Login redirect URI to http://localhost:8080/login/oauth2/code/okta then click Done:
     
<kbd><img src="https://i.ibb.co/p4Qjt2K/4-name.png" style="border:1px solid grey"/></kbd>

* Click Edit:

<kbd><img src="https://i.ibb.co/X7j77nS/5-edit.png" style="border:1px solid grey"/></kbd>

* In General Settings under Login, set Logout redirect URIs to http://localhost:3000 and http://localhost:8080 :
 
<kbd><img src="https://i.ibb.co/9TD09f3/6-logout.png" style="border:1px solid grey"/></kbd>

Your Okta account is now ready.

## Open This Directory With IntelliJ IDEA & Follow These Steps:


* Create an *application.yml* file in *src/main/resources*

* Copy the following into your *application.yml* file:

        
        spring:
          security:
            oauth2:
              client:
                registration:
                  okta:
                    client-id: {clientId}
                    client-secret: {clientSecret}
                    scope: openid, email, profile
                provider:
                  okta:
                    issuer-uri: https://{yourOktaDomain}.okta.com/oauth2/default
        


* Insert your *Client ID*, *Client Secret*, and *Okta domain* into the file

* Install the Lombok plugin in IntelliJ IDEA > Preferences > Plugins

* Run `./mvnw spring-boot:run` in the Terminal to start
