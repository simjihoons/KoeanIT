import React from "react";

const profileData = {
  apple: {
    name: "김사과",
    description: "학생, 착함",
  },
  banana: {
    name: "반하나",
    description: "회사원, 성실함",
  },
};

const Profile = ({ match }) => {
  const { username } = match.params;
  const profile = profileData[username];

  if (!profile) {
    return <div>존재하지 않는 프로필z</div>;
  }
  return (
    <>
      <h2>
        {username}({profile.name})
      </h2>
      <p>{profile.description}</p>
    </>
  );
};

export default Profile;
