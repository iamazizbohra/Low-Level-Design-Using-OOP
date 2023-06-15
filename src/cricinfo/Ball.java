package cricinfo;

import cricinfo.enumeration.BallType;

import java.util.List;

public class Ball {
    private Player balledBy;
    private Player playedBy;
    private BallType type;
    private Wicket wicket;
    private List<Run> runs;
    private Commentary commentary;
}
