package com.framgia.oleo.data.source

import com.framgia.oleo.data.source.model.FollowRequest
import com.framgia.oleo.data.source.model.Followed
import com.framgia.oleo.data.source.model.Friend
import com.framgia.oleo.data.source.model.FriendRequest
import com.framgia.oleo.data.source.model.Place
import com.framgia.oleo.data.source.model.User
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.ValueEventListener

class UserRepository(
    private val local: UserDataSource.Local,
    private val remote: UserDataSource.Remote
) : UserDataSource.Local, UserDataSource.Remote {

    override fun deleteFriendRequest(userId: String, friendId: String) {
        remote.deleteFriendRequest(userId, friendId)
    }

    override fun deleteFollowRequest(
        userId: String,
        friendId: String,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.deleteFollowRequest(userId, friendId, onSuccessListener, onFailureListener)
    }

    override fun checkFriendRequest(userId: String, friendId: String, valueEventListener: ValueEventListener) {
        remote.checkFriendRequest(userId, friendId, valueEventListener)
    }

    override fun getFollowRequestSingleValueEvent(
        userCurrent: User,
        userFriend: User,
        valueEventListener: ValueEventListener
    ) {
        remote.getFollowRequestSingleValueEvent(userCurrent, userFriend, valueEventListener)
    }

    override fun checkFriendByUserId(userId: String, friendId: String, valueEventListener: ValueEventListener) {
        remote.checkFriendByUserId(userId, friendId, valueEventListener)
    }

    override fun deleteFriend(userId: String, friendId: String) {
        remote.deleteFriend(userId, friendId)
    }

    override fun deleteUserFollowed(id: String, followed: Followed) {
        remote.deleteUserFollowed(id, followed)
    }

    override fun getFollowedsOfUser(id: String, childEventListener: ChildEventListener) {
        remote.getFollowedsOfUser(id, childEventListener)
    }

    override fun addUserFollowed(idUser: String, userFollowed: User) {
        remote.addUserFollowed(idUser, userFollowed)
    }

    override fun changeFollowStatus(userCurrent: User, followRequest: FollowRequest) {
        remote.changeFollowStatus(userCurrent, followRequest)
    }

    override fun updatePassword(
        userId: String,
        password: String,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.updatePassword(userId, password, onSuccessListener, onFailureListener)
    }

    override fun getFollowRequestsOfUser(id: String, status: String, childEventListener: ChildEventListener) {
        remote.getFollowRequestsOfUser(id, status, childEventListener)
    }

    override fun getFollowRequestById(id: String, user: User, valueEventListener: ValueEventListener) {
        remote.getFollowRequestById(id, user, valueEventListener)
    }

    override fun addFollowRequest(
        userCurrent: User,
        userFriend: User,
        onFailureListener: OnFailureListener,
        onSuccessListener: OnSuccessListener<Void>
    ) {
        remote.addFollowRequest(userCurrent, userFriend, onFailureListener, onSuccessListener)
    }

    override fun confirmFriendRequest(
        user: User, friend: User,
        friendRequest: FriendRequest,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.confirmFriendRequest(user, friend, friendRequest, onSuccessListener, onFailureListener)
    }

    override fun deleteFriendRequest(
        user: User,
        friendRequest: FriendRequest,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.deleteFriendRequest(user, friendRequest, onSuccessListener, onFailureListener)
    }

    override fun addFriend(userId: String, friendRequestId: String, user: User, friend: User) {
        remote.addFriend(userId, friendRequestId, user, friend)
    }

    override fun getFriendRequests(userId: String, valueEventListener: ValueEventListener) {
        remote.getFriendRequests(userId, valueEventListener)
    }

    override fun getUserById(userId: String, singleValueEventListener: ValueEventListener) {
        remote.getUserById(userId, singleValueEventListener)
    }

    override fun addFriendRequest(
        reciveId: String,
        user: User,
        message: String,
        onSuccessListener: OnSuccessListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.addFriendRequest(
            reciveId, user, message,
            onSuccessListener, onFailureListener
        )
    }

    override fun getUsers(valueEventListener: ValueEventListener) {
        remote.getUsers(valueEventListener)
    }

    override fun pushUserLocation(idUser: String, place: Place) {
        remote.pushUserLocation(idUser, place)
    }

    override fun registerUser(
        user: User,
        onCompleteListener: OnCompleteListener<Void>,
        onFailureListener: OnFailureListener
    ) {
        remote.registerUser(user, onCompleteListener, onFailureListener)
    }

    override fun getUserByPhoneNumber(phoneNumber: String, valueEventListener: ValueEventListener) {
        remote.getUserByPhoneNumber(phoneNumber, valueEventListener)
    }

    override fun getUser(): User? {
        return local.getUser()
    }

    override fun insertUser(vararg users: User) {
        return local.insertUser(*users)
    }

    override fun deleteUser() {
        return local.deleteUser()
    }

    override fun updateUser(vararg users: User) {
        return local.updateUser(*users)
    }

    override fun getFriendLocation(id: String, childEventListener: ChildEventListener) {
        remote.getFriendLocation(id, childEventListener)
    }

    override fun getContactsUser(userId: String, valueEventListener: ValueEventListener) {
        remote.getContactsUser(userId, valueEventListener)
    }

    override fun updateNameFriend(userId: String, friendId: String, newName: String,
        onSuccessListener: OnSuccessListener<Void>, onFailureListener: OnFailureListener) {
        remote.updateNameFriend(userId, friendId, newName, onSuccessListener, onFailureListener)
    }

    override fun getFriendById(userId: String, friendId: String,
        onValueEventListener: ValueEventListener) {
        remote.getFriendById(userId, friendId, onValueEventListener)
    }
}
