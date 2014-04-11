package junior.gitcommit;

import java.util.Properties;

/**
 * Created by junxy on 2014/4/11.
 */
public class GitRepositoryState {

    String branch;                  // =${git.branch}
    String describe;                // =${git.commit.id.describe}
    String commitId;                // =${git.commit.id}
    String commitIdAbbrev;          // =${git.commit.id.abbrev}
    String buildUserName;           // =${git.build.user.name}
    String buildUserEmail;          // =${git.build.user.email}
    String buildTime;               // =${git.build.time}
    String commitUserName;          // =${git.commit.user.name}
    String commitUserEmail;         // =${git.commit.user.email}
    String commitMessageFull;       // =${git.commit.message.full}
    String commitMessageShort;      // =${git.commit.message.short}
    String commitTime;              // =${git.commit.time}

    public GitRepositoryState(Properties properties) {
        this.branch = properties.get("git.branch").toString();
        this.describe = properties.get("git.commit.id.describe").toString();
        this.commitId = properties.get("git.commit.id").toString();
        this.buildUserName = properties.get("git.build.user.name").toString();
        this.buildUserEmail = properties.get("git.build.user.email").toString();
        this.buildTime = properties.get("git.build.time").toString();
        this.commitUserName = properties.get("git.commit.user.name").toString();
        this.commitUserEmail = properties.get("git.commit.user.email").toString();
        this.commitMessageShort = properties.get("git.commit.message.short").toString();
        this.commitMessageFull = properties.get("git.commit.message.full").toString();
        this.commitTime = properties.get("git.commit.time").toString();
    }

    @Override
    public String toString() {
        return "GitRepositoryState{" +
                "branch='" + branch + '\'' +
                ", describe='" + describe + '\'' +
                ", commitId='" + commitId + '\'' +
                ", commitIdAbbrev='" + commitIdAbbrev + '\'' +
                ", buildUserName='" + buildUserName + '\'' +
                ", buildUserEmail='" + buildUserEmail + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", commitUserName='" + commitUserName + '\'' +
                ", commitUserEmail='" + commitUserEmail + '\'' +
                ", commitMessageFull='" + commitMessageFull + '\'' +
                ", commitMessageShort='" + commitMessageShort + '\'' +
                ", commitTime='" + commitTime + '\'' +
                '}';
    }
}
