package siam.big.tutor.tutor.listener;

import java.io.Serializable;

/**
 * Created by supaj571 on 16/01/2561.
 */

public interface ListenerFilter <T extends Serializable> {
    void onListSelected(T data);
}
