def call(){
    def devopsControlFile = libraryResource "cicd-controls/${projKey}/${projKey}-${gitRepo}-controls.json"
    def flags = readJSON text: devopsControlFile

    env.applicationName = flags['applicationName']
    env.driver = flags['driver']
    env.dbType = flags['dbType']


    env.schemaName = flags[envir]['schemaName']
    env.dbUrl = flags[envir]['dbUrl']
    env.username = flags[envir]['username']
    env.password = flags[envir]['password']
    env.vaultAddress = flags[envir]['vaultAddress']
    env.vaultNS = flags[envir]['vaultNS']
    env.vaultPath = flags[envir]['vaultPath']
    

}

