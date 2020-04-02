package pruebagroovy

class UserController {

    def index() { }
    def handleLogin() {
        flash.message = "User not found!"
        
        redirect (uri:'/')
    }
}
