package siam.big.tutor.student.fragment;

import java.io.Serializable;

/**
 * Created by supaj571 on 05/03/2561.
 */

public interface test  <T extends Serializable>  {
    void OnSuccess(T res);
}
