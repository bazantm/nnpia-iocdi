package cz.upce.fei.nnpia.pred02beans.core;

public class SpeakerFactory {

    public Speaker getSpeaker() {
        //if
        return new SonySpeaker();
    }
}
