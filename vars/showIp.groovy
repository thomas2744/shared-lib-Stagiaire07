def call(String message) {
def ip =
com.oxiane.jenkins.lib.pRetriever.getMainAddress(env.JENKINS_URL)
echo "Build run on $ip"
}
