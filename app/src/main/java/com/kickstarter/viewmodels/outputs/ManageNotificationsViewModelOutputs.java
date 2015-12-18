package com.kickstarter.viewmodels.outputs;

import com.kickstarter.models.Notification;
import com.kickstarter.models.Project;

import java.util.List;

import rx.Observable;

public interface ManageNotificationsViewModelOutputs {
  Observable<List<Notification>> notifications();
}