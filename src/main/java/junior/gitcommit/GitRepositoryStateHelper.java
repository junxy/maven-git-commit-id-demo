package junior.gitcommit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by junxy on 2014/4/11.
 */
public class GitRepositoryStateHelper {

    private static GitRepositoryState gitRepositoryState;

    private static GitRepositoryStateHelper instance = new GitRepositoryStateHelper();

    protected GitRepositoryStateHelper() {

    }

    public static GitRepositoryStateHelper getInstance() {
        return instance;
    }

    public GitRepositoryState gitGitRepositoryState() throws IOException {
        if (gitRepositoryState == null) {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("git.properties");
            properties.load(inputStream);
            inputStream.close();

            gitRepositoryState = new GitRepositoryState(properties);
        }
        return gitRepositoryState;
    }
}
