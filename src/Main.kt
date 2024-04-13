fun main() {
    val songOne = Song("What a wonderful world", "Louis Armstrong")
    val songTwo = Song("So what", "Miles Davis")
    val songThree = Song("Fly me to the moon", "Frank Sinatra")
    songTwo.play()
    songTwo.stop()
    songOne.play()

    //For DVDPlayer Class
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}