<h2>Tyrannogotchi</h1>

<p>The backend of a Tamagotchi-inspired application where the user can create an account and take care of a virtual T-Rex.</p>

<p>See the frontend code <a href="https://github.com/helenakolberg/tyrannogotchi_frontend">here</a></p>

<h3>How To Run</h3>

<p>In order to run this application, you need to create a free <a href="https://developer.okta.com/">Okta Developer</a> account.</p>

<h4>Once you have successfully created an account, follow these steps:</h4>

<ul>
    <li>
        Login to Okta and click Applications:
        <br>
            <img src="https://i.ibb.co/zsR2602/1-applications.png" style="border:1px solid grey"/>
    </li>
    <br>
    <li>
        Click Add Application:
        <br>
            <img src="https://i.ibb.co/3pMsww0/2-add.png" style="border:1px solid grey"/>
    </li>
    <br>
    <li>
        Click Web and then Next:
        <br>
            <img src="https://i.ibb.co/nbW5HP3/3-webnext.png" style="border:1px solid grey"/>
    </li>
    <br>
    <li>
        Give your application a Name and set Login redirect URI to http://localhost:8080/login/oauth2/code/okta then click Done:
        <br>
            <img src="https://i.ibb.co/p4Qjt2K/4-name.png" style="border:1px solid grey"/>
    </li>
    <br>
    <li>
        Click Edit:
        <br>
            <img src="https://i.ibb.co/X7j77nS/5-edit.png" style="border:1px solid grey"/>
    </li>
    <br>
    <li>
        In General Settings under Login, set Logout redirect URIs to http://localhost:3000 and http://localhost:8080 :
        <br>
            <img src="https://i.ibb.co/9TD09f3/6-logout.png" style="border:1px solid grey"/>
    </li>
</ul>

<h4>Your Okta account is now good to go. Open this directory in IntelliJ IDEA and follow these steps:</h4>

<ul>
    <li>
        Create an <b>application.yml</b> file in <b>src/main/resources</b>
    </li>
    <li>
        Copy the following into your <b>application.yml</b> file:
        <br>
        
            spring:
          security:
            oauth2:
              client:
                registration:
                  okta:
                    client-id: 
                    client-secret: 
                    scope: openid, email, profile
                provider:
                  okta:
                    issuer-uri:
        
 </li>

</ul>