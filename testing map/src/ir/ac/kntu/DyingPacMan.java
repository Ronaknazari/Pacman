package ir.ac.kntu;


import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.scene.shape.Arc;


public class DyingPacMan extends Arc {

    private final Timeline timeline;

    public DyingPacMan(Timeline timeline) {
        this.timeline = timeline;
    }


    public void pause() {
        timeline.pause();
    }

    public void start() {
        timeline.play();
    }

    public boolean isRunning() {
//    return timeline.running;
        return timeline.getStatus() == Animation.Status.RUNNING;
    }

    public boolean isPaused() {
//    return timeline.paused;
        return timeline.getStatus() == Animation.Status.PAUSED;
    }

    public void startAnimation(int x, int y) {

//    startAngle = 90;
        setStartAngle(90);
//    centerX = x;
        setCenterX(x);
//    centerY = y;
        setCenterY(y);

        timeline.playFromStart();
    }

}
